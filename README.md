# gitlab-cicd-multimodule

There are different ways to structure the GitLab CICD pipeline. 
This multimodule project guides you to set up multiple gitlab-ci.yml in each module to run the pipeline for a
particular module when there are any changes exist to the module. 

Parent child pipeline is one of pipeline structure as per the GitLab documentation.
It is good for monorepos and projects with lots of independently defined components.
Gitlab Documentation link - https://docs.gitlab.com/ee/ci/pipelines/pipeline_architectures.html#child--parent-pipelines

In this example, illustrate how to trigger the pipeline for a module in multimodule project when
there are any changes to the particular module. As well as trigger the pipeline for parent when there
are changes to the parent project.
