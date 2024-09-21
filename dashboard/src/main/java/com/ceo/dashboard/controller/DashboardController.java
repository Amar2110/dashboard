package com.ceo.dashboard.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceo.dashboard.model.DashboardOverview;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @GetMapping("/overview")
    public ResponseEntity<DashboardOverview> getOverview() {
        DashboardOverview overview = new DashboardOverview();
        overview.setKpi1(100);
        overview.setKpi2(200);
        overview.setKpi3(300);
        return ResponseEntity.ok(overview);
    }
}