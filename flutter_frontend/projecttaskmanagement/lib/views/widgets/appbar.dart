import 'package:flutter/material.dart';

class BaseAppBar {

  static getAppBar() {
    return AppBar(
      titleSpacing: 50,
      centerTitle: false,
      toolbarHeight: 100,
      title: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: [
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Image.asset('assets/lexoro_logo.png', height: 300, width: 150),
            ),
            
            Row(
              children: [
                Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: Text("data"),
                ),
                Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: Text("data"),
                ),
                Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: Text("data"),
                ),

              ]
            ),
            // Text("Log Out"),

            DropdownButton<String>(
              items: <String>['A', 'B', 'C', 'D'].map((String value) {
                return DropdownMenuItem<String>(
                  value: value,
                  child: Text(value),
                );
              }).toList(),
              onChanged: (_) {},
            )

          ],
        ),
      elevation: 0,
      
    );
  }
  
}