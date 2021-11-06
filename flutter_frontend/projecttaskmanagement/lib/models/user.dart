// To parse this JSON data, do
//
//     final user = userFromJson(jsonString);

import 'dart:convert';

import 'package:projecttaskmanagement/models/projectIntegrate.dart';

User userFromJson(String str) => User.fromJson(json.decode(str));

String userToJson(User data) => json.encode(data.toJson());

class User {
    User({
        this.id,
        this.name,
        this.username,
        this.designation,
        this.email,
        this.password,
        this.status,
        this.projectIntegrates,
    });

    int id;
    String name;
    String username;
    String designation;
    String email;
    int password;
    String status;
    List<ProjectIntegrate> projectIntegrates;

    factory User.fromJson(Map<String, dynamic> json) => User(
        id: json["id"],
        name: json["name"],
        username: json["username"],
        designation: json["designation"],
        email: json["email"],
        password: json["password"],
        status: json["status"],
        projectIntegrates: List<ProjectIntegrate>.from(json["projectIntegrates"].map((x) => ProjectIntegrate.fromJson(x))),
    );

    Map<String, dynamic> toJson() => {
        "id": id,
        "name": name,
        "username": username,
        "designation": designation,
        "email": email,
        "password": password,
        "status": status,
        "projectIntegrates": List<dynamic>.from(projectIntegrates.map((x) => x.toJson())),
    };
}

