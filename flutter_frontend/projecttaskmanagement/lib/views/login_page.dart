import 'package:flutter/material.dart';
import 'package:form_field_validator/form_field_validator.dart';
import 'package:projecttaskmanagement/api_service/login_api.dart';
import 'package:projecttaskmanagement/models/login_class.dart';
import 'package:projecttaskmanagement/models/recieve_user.dart';

class Login extends StatefulWidget {
  @override
  State<Login> createState() => _LoginState();
}

class _LoginState extends State<Login> {
  GlobalKey<FormState> _formkey = GlobalKey<FormState>();

  LoginModel loginModel = LoginModel("", "");
  RecieveUser recieveUser = RecieveUser();
  String errorText = "";

  Future<void> getLoginedUser() async {
    recieveUser = await LoginApi.getUser(loginModel);
    // recieveUser = {
    //   user: user,
    //   status: true/false,
    //   error: ""/"Error"
    // }
  }

  void validate() async {
    if (_formkey.currentState.validate()) {
      await getLoginedUser();

      setState(() {
        if (recieveUser.error == 'Error') {
          errorText = "Some problem occured, please try again later";
        } else if (!recieveUser.status) {
          errorText = "Envalid email or password";
        }
      });

      if (recieveUser.loggedIn) {
        Navigator.of(context).pushNamedAndRemoveUntil('/home', (route) => false,
            arguments: recieveUser);
      }
    }
  }

  String validPassword(value) {
    if (value.isEmpty) {
      return "*required";
    } else if (value.length < 6) {
      return "Should be at least 6 characters";
    } else if (value.length > 15) {
      return "Should not be more than 15 characters";
    } else {
      return null;
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Container(
          // width: MediaQuery.of(context).size.width,
          width: 450,
          height: 550,
          // color: Colors.white54,
          child: Center(
              child: Form(
            autovalidateMode: AutovalidateMode.always,
            key: _formkey,
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.center,
              children: [
                // Login Text
                Padding(
                  padding: const EdgeInsets.all(12.0),
                  child: Text("Login",
                      style: TextStyle(
                        fontSize: 30,
                        color: Colors.blueGrey,
                        fontWeight: FontWeight.w900,
                      )),
                ),
                SizedBox(height: 60),

                // Email field
                Padding(
                  padding: const EdgeInsets.only(
                      left: 40, right: 40, top: 10, bottom: 40),
                  child: TextFormField(
                    onChanged: (val) {
                      loginModel.email = val;
                    },
                    validator: MultiValidator([
                      RequiredValidator(errorText: "Required *"),
                      EmailValidator(errorText: "Not a valid email"),
                    ]),
                    decoration: InputDecoration(labelText: "Email"),
                  ),
                ),

                // Passward field
                Padding(
                  padding: const EdgeInsets.only(
                      left: 40, right: 40, top: 10, bottom: 40),
                  child: TextFormField(
                    obscureText: true,
                    enableSuggestions: false,
                    onChanged: (val) {
                      loginModel.password = val;
                    },
                    validator: validPassword,
                    decoration: InputDecoration(labelText: "Password"),
                  ),
                ),

                Padding(
                  padding: const EdgeInsets.only(bottom: 2),
                  child: Text(
                    errorText,
                    style: TextStyle(color: Colors.redAccent),
                  ),
                ),

                // Login button
                Padding(
                  padding: const EdgeInsets.only(top: 20.0),
                  child: ElevatedButton.icon(
                    icon: Icon(Icons.login),
                    style: ElevatedButton.styleFrom(
                      primary: Colors.blueGrey, // background
                      onPrimary: Colors.white, // foreground
                    ),
                    onPressed: validate,
                    label: Text('Login'),
                  ),
                ),

                SizedBox(height: 50),
                // sign in or forgate password
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Padding(
                      padding: const EdgeInsets.only(left: 45.0),
                      child: MouseRegion(
                        cursor: SystemMouseCursors.click,
                        child: GestureDetector(
                          child: Text("Not Signed in ? ask the admin",
                              style: TextStyle(color: Colors.blue)),
                          onTap: () {
                            print("clicked");
                          },
                        ),
                      ),
                    ),
                    Padding(
                      padding: const EdgeInsets.only(right: 45.0),
                      child: MouseRegion(
                        cursor: SystemMouseCursors.click,
                        child: GestureDetector(
                          child: Text("Forget password ?",
                              style: TextStyle(color: Colors.blue)),
                          onTap: () {
                            print("Clicked");
                          },
                        ),
                      ),
                    ),
                  ],
                ),
              ],
            ),
          )),
        ),
      ),
    );
  }
}
