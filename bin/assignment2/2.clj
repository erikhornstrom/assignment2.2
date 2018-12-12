(defmacro select [what _ list _ cond _ orderValue]
 
  )


(def persons `({:id 1 :name "olle"} {:id 2 :name "anna"} {:id 3 :name
"isak"} {:id 4 :name "beatrice"}))

(select [:id :name] from persons where [:id > 2] orderby :name)

({:id 4 :name "beatrice"} {:id 3 :name "isak"})

(print persons)

;göra map av map, skapa ny map med select-keys. applicera cond. sort-by
;1 map av map. 2 applicera cond. 3 select keys. Sort by.
;(sort-by (select-keys (listwithfullfilleCond (mapOfmaps?))) orderValue)