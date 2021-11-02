
import 'package:flutter/material.dart';
import 'package:projecttaskmanagement/views/widgets/appbar.dart';

class HomePage extends StatefulWidget {

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: BaseAppBar.getAppBar(),
    );
  }
}