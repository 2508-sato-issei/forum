package com.example.forum.repository;

import com.example.forum.repository.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer> {
    public List<Report> findAllByOrderByUpdatedDateDesc();

    public List<Report> findByCreatedDateBetweenOrderByUpdatedDateDesc(Timestamp startDate, Timestamp endDate);
}
