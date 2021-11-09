
import 'package:flutter/material.dart';
import 'package:projecttaskmanagement/models/recieve_user.dart';
import 'package:projecttaskmanagement/views/widgets/appbar/appbar.dart';

class Developers extends StatefulWidget {

  @override
  _DevelopersState createState() => _DevelopersState();
}

class _DevelopersState extends State<Developers> {
  @override
  Widget build(BuildContext context) {
    final RecieveUser user = ModalRoute.of(context).settings.arguments as RecieveUser;

    return Scaffold(
      appBar: BaseAppBar.getAppBar(user),
      body: Center(child: Text("Developers")),
    );
  }
}