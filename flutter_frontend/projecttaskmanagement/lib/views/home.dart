
import 'package:flutter/material.dart';
import 'package:projecttaskmanagement/models/recieve_user.dart';
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
      appBar: BaseAppBar.getAppBar(user),
      body: Center( child: Text(user.user.email)),
    );
  }
}