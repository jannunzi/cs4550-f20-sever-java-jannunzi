package com.example.cs4550f20serverjavajannunzi.controllers;

import com.example.cs4550f20serverjavajannunzi.models.Widget;
import com.example.cs4550f20serverjavajannunzi.services.WidgetService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {
    WidgetService service = new WidgetService();

    @GetMapping("/api/topics/{tid}/widgets")
    public List<Widget> findWidgetsForTopic(
            @PathVariable("tid") String topicId) {
        return service.findWidgetsForTopic(topicId);
    }

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return service.findAllWidgets();
    }
    @GetMapping("/api/widgets/{wid}")
    public Widget findWidgetById(
            @PathVariable("wid") String widgetId) {
        return service.findWidgetById(widgetId);
    }
    @PostMapping("/api/topics/{topicId}/widgets")
    public Widget createWidgetForTopic(
            @PathVariable("topicId") String topicId,
            @RequestBody Widget widget) {
        widget.setTopicId(topicId);
        return service.createWidget(widget);
    }
    @PostMapping("/api/widgets")
    public Widget createWidget(
            @RequestBody Widget widget) {
        return service.createWidget(widget);
    }
    @DeleteMapping("/api/widgets/{wid}")
    public Integer deleteWidget(String widgetId) {
        return null;
    }
    @PutMapping("/api/widgets/{wid}")
    public Integer updateWidget(String widgetId, Widget newWidget) {
        return null;
    }
}
