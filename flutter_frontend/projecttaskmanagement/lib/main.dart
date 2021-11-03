import 'package:flutter/material.dart';
import 'package:projecttaskmanagement/views/developers.dart';
import 'package:projecttaskmanagement/views/home.dart';
import 'package:projecttaskmanagement/views/login_page.dart';
import 'package:projecttaskmanagement/views/projects.dart';

void main() {
  runApp(MyApp(appTitle: "Project Task Management",));
}

class MyApp extends StatelessWidget {

  final String appTitle;

  const MyApp({Key key, this.appTitle}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: appTitle,
      theme: ThemeData(
        appBarTheme: AppBarTheme(
          backgroundColor: Colors.white,
          foregroundColor: Colors.black,
        ),
        // primarySwatch: Colors.amber,
      ),
      
      routes: {
        '/': (context) => Login(),
        '/home': (context) => HomePage(),
        '/registration': (context) => Scaffold(),
        '/projects': (context) => Projects(),
        '/developers': (context) => Developers(),
      },
    );
  }
}
