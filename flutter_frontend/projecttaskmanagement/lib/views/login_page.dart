import 'package:flutter/material.dart';
import 'package:form_field_validator/form_field_validator.dart';

class Login extends StatelessWidget {
  GlobalKey<FormState> _formkey = GlobalKey<FormState>();

  void validate() {
    if (_formkey.currentState.validate()) {
      print("validate!");
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
          height: 500,
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
                      print(val);
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
                      print(val);
                    },
                    validator: validPassword,
                    decoration: InputDecoration(labelText: "Password"),
                  ),
                ),

                // Login button
                ElevatedButton.icon(
                  icon: Icon(Icons.login),
                  style: ElevatedButton.styleFrom(
                    primary: Colors.blueGrey, // background
                    onPrimary: Colors.white, // foreground
                  ),
                  onPressed: validate,
                  label: Text('Login'),
                ),

                SizedBox(height: 50),
                // sign in or forgate password 
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Padding(
                      padding: const EdgeInsets.only(left: 50.0),
                      child: MouseRegion(
                        cursor: SystemMouseCursors.click,
                        child: GestureDetector(
                          child: Text("Sign in ?", style: TextStyle(color: Colors.blue)),
                          onTap: (){
                            print("clicked");
                          },
                        ),
                      ),
                    ),
                    Padding(
                      padding: const EdgeInsets.only(right: 50.0),
                      child: MouseRegion(
                        cursor: SystemMouseCursors.click,
                        child: GestureDetector(
                          child: Text("Forget password ?", style: TextStyle(color: Colors.blue)),
                          onTap: (){
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
