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
                  padding: const EdgeInsets.only(left: 20),
                  child: TextButton(
                    onPressed: (){}, 
                    child: Text("Home", style: TextStyle(color: Colors.black, fontSize: 15 ),)
                  ),
                ),
                Padding(
                  padding: const EdgeInsets.only(left: 20),
                  child: TextButton(
                    onPressed: (){},
                    child: TextButton(
                      onPressed: (){},
                      child: Text("Projects", style: TextStyle(color: Colors.black, fontSize: 15 ))
                    )
                  ),
                ),
                Padding(
                  padding: const EdgeInsets.only(left: 20),
                  child: TextButton(
                    onPressed: (){},
                    child: Text("Developers", style: TextStyle(color: Colors.black, fontSize: 15 ))
                  ),
                ),

              ]
            ),
            

            Row(
              children: [
                Text("Saqib, Aminul Islam", style: TextStyle(color: Colors.black, fontSize: 15, fontWeight: FontWeight.w500)),

                PopupMenuButton(
                  icon: Icon(Icons.person),
                  onSelected: (item) {},
                  itemBuilder: (context) => [
                    PopupMenuItem(child: Text('Logout')),
                    PopupMenuItem(child: Text('Settings')),
                  ],
                ),
              ],
            ),

          ],
        ),
      elevation: 0,
      
    );
  }
  
}