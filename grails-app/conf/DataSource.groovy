dataSource {
        pooled = true
        driverClassName = "org.postgresql.Driver"
        username = "visesh"
        password = "erised"
}
hibernate {
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.provider_class='org.hibernate.cache.EhCacheProvider'
}
// environment specific settings
environments {
        development {
                dataSource {
                        dbCreate = "update" // one of 'create', 'create-drop','update'
                        url = "jdbc:postgresql://localhost:5432/eltropy"
                }
        }
        test {
                dataSource {
                        dbCreate = "update"
                        url = "jdbc:postgresql://localhost:5432/eltropy"
                }
        }
        production {
                dataSource {
                        dbCreate = "update"
                        url = "jdbc:postgresql://localhost:5432/eltropy"
                }
        }
}