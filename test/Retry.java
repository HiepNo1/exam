package oop.test;

import oop.examstream.AthenaStudent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Retry {
    public static Map<Integer, List<Worker>> deviceGroup(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(Worker::getGroup));
    }

    public static Map<Integer, List<Worker>> lateWorker(List<Worker> workers) {
        List<Worker> workerList = new ArrayList<>();
        workers.forEach(worker -> {
            int count = 0;
            for (int i = 0; i < worker.getTimekeeping().size(); i++) {
                if (worker.getTimekeeping().get(i).getHour() >= 7 && worker.getTimekeeping().get(i).getMinute() >= 30 && worker.getTimekeeping().get(i).getSecond() > 0) {
                    count++;
                }
            }
            if (count == 3) {
                workerList.add(worker);
            }
        });
        return deviceGroup(workerList);
    }

    public static Map<Integer, List<Worker>> worker3(List<Worker> workers) {
        List<Worker> workerList = new ArrayList<>();
        workers.forEach(worker -> {

        });
        return deviceGroup(workerList);
    }
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<Worker>(){
            {
                add(new Worker("1", "Hiep", LocalDate.of(2001, 11, 6), "TB", 1, List.of(LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20))));
                add(new Worker("2", "Hiep", LocalDate.of(2001, 11, 6), "TB", 2, List.of(LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20))));
                add(new Worker("3", "Hiep", LocalDate.of(2001, 11, 6), "TB", 3, List.of(LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20))));
                add(new Worker("4", "Hiep", LocalDate.of(2001, 11, 6), "TB", 4, List.of(LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20))));
                add(new Worker("5", "Hiep", LocalDate.of(2001, 11, 6), "TB", 5, List.of(LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20))));
                add(new Worker("6", "Hiep", LocalDate.of(2001, 11, 6), "TB", 6, List.of(LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20))));
                add(new Worker("7", "Hiep", LocalDate.of(2001, 11, 6), "TB", 7, List.of(LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20))));
                add(new Worker("8", "Hiep", LocalDate.of(2001, 11, 6), "TB", 8, List.of(LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20))));
                add(new Worker("9", "Hiep", LocalDate.of(2001, 11, 6), "TB", 9, List.of(LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20))));
                add(new Worker("10", "Hiep", LocalDate.of(2001, 11, 6), "TB", 10, List.of(LocalDateTime.of(2022, 9, 19, 7, 30, 20), LocalDateTime.of(2022, 9, 19, 7, 30, 20))));
            }
        };

        System.out.println("1");
        System.out.println(deviceGroup(workers));

        System.out.println("2");
        System.out.println(lateWorker(workers));

    }
}
