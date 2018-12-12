(defmacro select [what _ list _ cond _ orderValue]
  `(sort-by ~orderValue (filterTable ~what ~list))
  )

(defmacro select2 [what _ list _ cond _ orderValue]
  `(sort-by ~orderValue (filterTable ~what ~list))
  )


(def persons `({:id 1 :name "olle" :test 2} {:id 2 :name "anna"} {:id 3 :name
"isak"} {:id 4 :name "beatrice"}))

;(select [:id :name] from persons where [:id > 2] orderby :name)

(select2 [:id :name] from persons where [:id > 2] orderby :name)


(defn filterTable [what list]
  (map (fn [n] (select-keys n what)) persons))

(defn applyCondition [cond list]
  (filter 
    (fn [n] 
      ( (second cond) (. n (first cond)) (last cond) ))
  list)
)



;göra map av map, skapa ny map med select-keys. applicera cond. sort-by
;1 map av map. 2 applicera cond. 3 select keys. Sort by.
;(sort-by (select-keys (listwithfullfilleCond (mapOfmaps?))) orderValue)