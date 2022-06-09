package com.example.demo.Repository;

import com.example.demo.entity.Festival;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
/**
 * This is Festival Repository class
 */
public interface FestivalRepository extends JpaRepository<Festival,Integer> {
    List<Festival> findByplace(String city);

    @Query("SELECT f FROM Festival f WHERE f.name =:name")
    public  List<Festival> getfestivalsbyname(@Param("name") String name);




   //@Query("SELECT f FROM Festival f WHERE f.festivalid (SELECT fr.festival.festivalid FROM FestivalRun fr GROUP BY fr.festival.festivalid)")
   @Query("SELECT a FROM Festival a WHERE a.festivalid IN (SELECT b.festival.festivalid FROM Festival a, FestivalRun b GROUP BY b.festival.festivalid HAVING COUNT(*)>0)")
   public List<Festival> getpopularfestivals();

}
