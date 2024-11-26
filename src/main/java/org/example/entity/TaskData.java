package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String task){
        switch (task){
        case "ann":
            return annsTasks;
        case "bob":
            return bobsTasks;
        case "carol":
            return carolsTasks;
        case "all":
            Set<Task> all = new HashSet<>();
            all.addAll(annsTasks);
            all.addAll(bobsTasks);
            all.addAll(carolsTasks);
            all.addAll(unassignedTasks);
            return all;

        default:
            return unassignedTasks;
            }

    }

    public Set<Task> getUnion(Set<Task> setList, Set<Task> setList2) {
        Set<Task> total = new HashSet<>();
        total.addAll(setList);
        total.addAll(setList2);
        return total;
    }

    public Set<Task> getIntersection(Set<Task> setList, Set<Task> setList2) {
        Set<Task> intersection = new HashSet<>(setList);
        intersection.retainAll(setList2);
        return intersection;
    }

    public Set<Task> getDifferences(Set<Task> setList, Set<Task> setList2) {
        setList.removeAll(setList2);

        return setList;
    }


}
