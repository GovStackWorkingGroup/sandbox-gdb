# CI CD

## Build image & Deployment
Build image process of creating image and installing Payment Builing Block EMULATOR in EKS cluster.

Image Version will be based on the project version, defined in [build.gradle file](./../implementation/build.gradle)

### CI environment variables
| Variable          | Description                                    | Value                                                 |
| :---------------- | :--------------------------------------------- | :---------------------------------------------------- |
| AWS_CICD_ROLE     | The AWS role that is used by the CI pipeline   | "CICDPipeline_sandbox-bb-digital-registries_Role_dev" |
| ECR_EMULATOR_NAME | The name of the AWS ECR for the emulator image | "bb/digital-registries/emulator/dev-backend"          |

## Trigger pipeline
To run follow those steps:

    1. navigate to project in CircleCI
    2. select branch from the dropdown
    3. select "Trigger pipeline" action
    4. Add parameter of type "Boolean", named "emulator_build_deploy_allowed" and set value to "true"
    5. Then trigger "Emulator Build and Deploy" pipeline
    6. Approve the first CI Job

NOTE: Current state is covering only image BUILD and UPLOAD to ECR.