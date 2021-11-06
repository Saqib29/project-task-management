class ProjectIntegrate {
    ProjectIntegrate({
        this.id,
    });

    int id;

    factory ProjectIntegrate.fromJson(Map<String, dynamic> json) => ProjectIntegrate(
        id: json["id"] as int,
    );

    Map<String, dynamic> toJson() => {
        "id": id,
    };
}
