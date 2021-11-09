
import 'package:flutter/material.dart';
import 'package:projecttaskmanagement/models/recieve_user.dart';
import 'package:projecttaskmanagement/views/widgets/appbar/appbar.dart';

class Projects extends StatefulWidget {

  @override
  _ProjectsState createState() => _ProjectsState();
}

class _ProjectsState extends State<Projects> {
  @override
  Widget build(BuildContext context) {
    final RecieveUser user = ModalRoute.of(context).settings.arguments as RecieveUser;

    return Scaffold(
      appBar: BaseAppBar.getAppBar(user),
      body: Center(child: Text("Projects Page")),
    );
  }
}