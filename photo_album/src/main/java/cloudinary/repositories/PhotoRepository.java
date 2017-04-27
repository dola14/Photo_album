package cloudinary.repositories;

import com.cloudinary.*;
import cloudinary.models.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}