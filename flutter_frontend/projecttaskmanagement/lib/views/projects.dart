
import 'package:flutter/material.dart';
import 'package:projecttaskmanagement/views/widgets/appbar/appbar.dart';

class Projects extends StatefulWidget {

  @override
  _ProjectsState createState() => _ProjectsState();
}

class _ProjectsState extends State<Projects> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: BaseAppBar.getAppBar(),
      body: Center(child: Text("Projects Page")),
    );
  }
}