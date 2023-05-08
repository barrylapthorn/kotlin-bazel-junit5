load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_binary")

kt_jvm_binary(
    name="hello_world",
    srcs = glob(["src/main/kotlin/**/*.kt"])
    main_class = "com.example.HelloWorldKt",
    //resources = 
    visibility = ["//visibility:public"],
)