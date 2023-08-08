package com.study.project.question.repository;

import com.study.project.question.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionJpaRepository extends JpaRepository<Question, Long> {
    Page<Question> findAllBySubjectContainingIgnoreCaseOrContentContainingIgnoreCase(Pageable pageable, String subject, String content);

}
