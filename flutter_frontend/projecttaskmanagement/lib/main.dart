import 'package:flutter/material.dart';
import 'package:projecttaskmanagement/views/home.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Project Task Management',
      theme: ThemeData(
        appBarTheme: AppBarTheme(
          backgroundColor: Colors.white,
          foregroundColor: Colors.black,
        ),
        // primarySwatch: Colors.amber,
      ),
      home: HomePage(),
    );
  }
}
