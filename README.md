# HipStore-Common
HipStore API Specification

## Anything is data ##
### And any app(service) that works with anything can be separated to the several logical layers -> ###
 * Network layer - that consumes requests from network (http server, rtmp host, binary etc.)
 * Front-end layer - that translates requests to internal service representation
 * Data format layer - that processes requests, handling events and manages data format (format as json, xml, msgpack)
 * Storage layer - that stores all data in memory, disk, remote or local database etc.

### Main idea of HipStores is provide awesome api specification for it to enable switching between layers implementations without changing main application(service) logic. ###
