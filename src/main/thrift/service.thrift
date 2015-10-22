namespace java me.service.generated.thrift

include "common.thrift"

struct Stats {
    1: common.User user,
    2: map<string, i32> stats,
}


struct GetStatsRequest {
    1: common.User user,
    2: list<string> groups,
}

struct GetStatsResponse {
    1: map<string, i32> stats
}

service StatsService {
    GetStatsResponse getStats(1: GetStatsRequest request)
}
