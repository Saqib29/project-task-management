import 'dart:convert';

import 'package:http/http.dart' as http;
import 'package:projecttaskmanagement/models/login_class.dart';

class LoginApi{

 static Future getUser(LoginModel login) async{
   String url = "http://localhost:8081/login";
   var request_body = {
     'email': login.email, // "aminul@emial.com"
     'password': login.password, // "1234"
   };

   var response = await http.post(
     Uri.parse(url),
     headers: {
      "Content-Type": "application/json",
      "Access-Control-Allow-Origin": "*", // Required for CORS support to work
      // "Access-Control-Allow-Credentials": "true", // Required for cookies, authorization headers with HTTPS
      // "Access-Control-Allow-Headers": "Origin,Content-Type,X-Amz-Date,Authorization,X-Api-Key,X-Amz-Security-Token,locale",
      // "Access-Control-Allow-Methods": "POST, OPTIONS"
     },
     body: json.encode(request_body)
   );

  //  print(json.decode(response.body)['name']);
  Map user = json.decode(response.body);
  // print(response.body != "" ? response.body : null);
  // print(response.statusCode);
  print(user);

  // return type
  // {"id":2,"name":"Saqib Aminul","username":"aminul","designation":"SENIOR_DEVELOPERS","email":"saqib@email.com","password":"123456","status":"ACTIVE","projectIntegrates":[]}
  // or null means empty string.  
 } 
}