
import 'package:flutter/material.dart';

class Login extends StatelessWidget {

  GlobalKey<FormState> _formkey = GlobalKey<FormState>();

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
              key: _formkey,
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Padding(
                    padding: const EdgeInsets.all(12.0),
                    child: Text("Login", style: TextStyle(
                      fontSize: 30, color:Color(0xFF363f93),
                      fontWeight: FontWeight.w900,
                      )
                    ),
                  ),
                  SizedBox(height: 60),
                  Padding(
                    padding: const EdgeInsets.only(left: 40, right: 40, top: 10, bottom: 40),
                    child: TextFormField(
                      onChanged: (val){
                        print(val);
                      },
                      decoration: InputDecoration(
                        labelText: "Email"
                      ),
                    ),
                  ),

                  // SizedBox(height: 20),
                  Padding(
                    padding: const EdgeInsets.only(left: 40, right: 40, top: 10, bottom: 40),
                    child: TextFormField(
                      obscureText: true,
                      enableSuggestions: false,
                      onChanged: (val){
                        print(val);
                      },
                      decoration: InputDecoration(
                        labelText: "Password"
                      ),
                    ),
                  ),
                ],
              ),
            )
          ),
        ),
      ),
    );
  }
}