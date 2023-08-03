package com.study.project.question.repository;

import com.study.project.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionJpaRepository extends JpaRepository<Question, Long> {


}
