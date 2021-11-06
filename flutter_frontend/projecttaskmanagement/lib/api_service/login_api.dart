import 'dart:convert';

import 'package:http/http.dart' as http;
import 'package:projecttaskmanagement/models/login_class.dart';
import 'package:projecttaskmanagement/models/recieve_user.dart';

class LoginApi {
  static Future<RecieveUser> getUser(LoginModel login) async {
    RecieveUser recieveUser = RecieveUser();


    String url = "http://localhost:8081/login";
    var request_body = {
      'email': login.email, // "aminul@emial.com"
      'password': login.password, // "1234"
    };

    try {
      var response = await http.post(Uri.parse(url),
          headers: {
            "Content-Type": "application/json",
            "Access-Control-Allow-Origin": "*",
          },
          body: json.encode(request_body));

      if (response.statusCode == 200){
        Map user = json.decode(response.body);
        if(user['status']){
          recieveUser = RecieveUser.fromJson(user);
        }else{
          recieveUser.status = false;
        }
      }
      

    } catch (e) {
      recieveUser.error = "Error";
      recieveUser.status = false;
      print(e.message);
    }

    recieveUser.loggedIn = true;

    return recieveUser;

    // return type
    // {"id":2,"name":"Saqib Aminul","username":"aminul","designation":"SENIOR_DEVELOPERS","email":"saqib@email.com","password":"123456","status":"ACTIVE","projectIntegrates":[]}
    // or null means empty string.
  }
}
