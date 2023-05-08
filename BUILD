load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_binary", "kt_jvm_test")

kt_jvm_binary(
    name="hello_world",
    srcs = glob(["src/main/kotlin/**/*.kt"]),
    main_class = "com.example.HelloWorldKt",
    #resources = 
    visibility = ["//visibility:public"],
)

kt_jvm_test(
    name="hello_world_test",
    srcs = glob(["src/test/kotlin/**/*.kt"]),
    args = [
        "--select-package=com.example",
    ],
    main_class = "org.junit.platform.console.ConsoleLauncher",
    deps = [
        ":hello_world",
        "@maven//:org_junit_jupiter_junit_jupiter_api",
        "@maven//:org_junit_jupiter_junit_jupiter_engine",
        "@maven//:org_junit_jupiter_junit_jupiter_params",
        "@maven//:org_junit_platform_junit_platform_launcher",
    ],
    runtime_deps = [
        "@maven//:org_junit_platform_junit_platform_console",
    ]
)