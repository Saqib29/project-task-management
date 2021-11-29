
import 'package:flutter/material.dart';
import 'package:projecttaskmanagement/models/recieve_user.dart';
import 'package:projecttaskmanagement/views/widgets/appbar/admin_appbar.dart';
import 'package:projecttaskmanagement/views/widgets/appbar/appbar.dart';

class HomePage extends StatefulWidget {

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    final RecieveUser user = ModalRoute.of(context).settings.arguments as RecieveUser;
        
    return Scaffold(
      appBar: user.user.designation == "ADMIN" ? AdminAppBar.getAppBar(user) : BaseAppBar.getAppBar(user),
      body: Container(
        padding: EdgeInsets.all(35),
        color: Colors.yellow,
        width: 100,
        height: 100,
      ),
    );
  }
}