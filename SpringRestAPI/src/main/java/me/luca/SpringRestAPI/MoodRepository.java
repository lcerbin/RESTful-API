package me.luca.SpringRestAPI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoodRepository extends JpaRepository<Mood, Integer>{
	List<Mood> findByHeader(String text, String textAgain);
}
