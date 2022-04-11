(defproject ca.michaelvaldron.blog "0.1.0"
            :description "My personal blog website."
            :url "https://github.com/michael-valdron/blog"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.10.1"]
                           [ring/ring-devel "1.8.2"]
                           [compojure "1.6.2"]
                           [ring-server "0.5.0"]
                           [cryogen-flexmark "0.1.4"]
                           [cryogen-core "0.4.1"]]
            :plugins [[lein-ring "0.12.5"]]
            :main ca.michaelvaldron.blog.core
            :ring {:init ca.michaelvaldron.blog.server/init
                   :handler ca.michaelvaldron.blog.server/handler}
            :aliases {"serve"      ["run" "-m" "ca.michaelvaldron.blog.server"]
                      "serve:fast" ["run" "-m" "ca.michaelvaldron.blog.server" "fast"]})
