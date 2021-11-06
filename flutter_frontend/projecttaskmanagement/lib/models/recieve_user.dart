// To parse this JSON data, do
//
//     final recieveUser = recieveUserFromJson(jsonString);

import 'dart:convert';

import 'package:projecttaskmanagement/models/user.dart';

RecieveUser recieveUserFromJson(String str) => RecieveUser.fromJson(json.decode(str));

String recieveUserToJson(RecieveUser data) => json.encode(data.toJson());

class RecieveUser {
    RecieveUser({
        this.user,
        this.status,
    });

    User user;
    bool status;
    String error = "";
    bool loggedIn = false;

    factory RecieveUser.fromJson(Map<String, dynamic> json) => RecieveUser(
        user: User.fromJson(json["user"]),
        status: json["status"] as bool,
    );

    Map<String, dynamic> toJson() => {
        "user": user.toJson(),
        "status": status,
    };
}
