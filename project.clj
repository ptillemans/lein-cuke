(defproject org.clojars.rferraz/lein-cuke "1.1.1"
  :description "Cucumber runner for leiningen"
  :repositories {"cukes" "http://cukes.info/maven"
                 "clojars" "http://clojars.org/repo"}
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [cuke4duke "0.4.4"
                  :exclusions [org.clojure/clojure
                               org.clojure/clojure-contrib]]]
  :dev-dependencies [[lein-clojars "0.6.0"]])

