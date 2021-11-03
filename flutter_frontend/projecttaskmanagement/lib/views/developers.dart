
import 'package:flutter/material.dart';
import 'package:projecttaskmanagement/views/widgets/appbar/appbar.dart';

class Developers extends StatefulWidget {

  @override
  _DevelopersState createState() => _DevelopersState();
}

class _DevelopersState extends State<Developers> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: BaseAppBar.getAppBar(),
      body: Center(child: Text("Developers")),
    );
  }
}