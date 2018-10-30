(defn count_joins [sub arr] (
    count (filter (fn [e] (= e sub)) arr)
))
(println (count_joins '(1, 2, 3) '((1, 2 ,3), (1, 2, 3))))
