package com.form.demo.repository;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.form.demo.model.*;
@SuppressWarnings("unused")
@Service
public interface formrep extends MongoRepository<formModel,Integer>
{
	

}
