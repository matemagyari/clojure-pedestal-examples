(ns core.user-repository)

(def repository (atom {}))

(defn create-user [{:keys [user-id] :as user}]
  (swap! repository assoc user-id user))

(defn find-user [user-id]
  (get @repository user-id))

