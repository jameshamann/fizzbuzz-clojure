(defproject fizzbuzz-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[speclj "3.3.0"]]}}
  :main ^:skip-aot fizzbuzz-clojure.core
  :target-path "target/%s"
  :plugins [[speclj "3.3.0"]]
  :test-paths ["spec"])
