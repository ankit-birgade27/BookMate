package com.bookmate.service;


import java.math.BigDecimal;
import java.util.List;

import com.bookmate.model.Fine;


public interface FineService {

    Fine calculateFine(String issueId);

    Fine getFineById(String fineId);

    List<Fine> getAllFines();

    List<Fine> getMemberFines(String memberId);

    BigDecimal getTotalOutstandingFine(String memberId);

    void payFine(String fineId);

    void waiveFine(String fineId);

    boolean hasOutstandingFine(String memberId);
}
