# sandbox-gdb

Install Helm chart

helm install digital-registries ./digital-registries/

The "digital-registries" chart contains the following sub-charts:

* A chart for GDB (digital-registries/charts/gdb)

The sub-chart contains a GDB application, a remote relational database (a Kubernetes Pod running PostgreSQL), a remote in-memory data store (a Kubernetes Pod running Redis) and secrets (passwords created randomly in Kubernetes Cluster)

When installing the "digital-registries" chart, the installation of those sub-charts can be configured in the file "./digital-registries/Values.yaml":

- by setting the boolean value of the "enabled" parameter of specific sub-chart
