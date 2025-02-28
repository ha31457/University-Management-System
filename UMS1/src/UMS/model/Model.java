package UMS.model;

import UMS.AbstractClasses.BaseEntity;
import UMS.Exceptions.DuplicateIDException;
import UMS.Exceptions.IdNotFoundException;
import UMS.Exceptions.NegativeIDException;
import UMS.Interfaces.IEntityManager;

import java.util.ArrayList;

public class Model implements IEntityManager {

    private ArrayList<BaseEntity> studentArrayList;
    private ArrayList<BaseEntity> teacherArrayList;
    private ArrayList<BaseEntity> courseArrayList;

    public Model(){
        studentArrayList = new ArrayList<BaseEntity>();
        teacherArrayList = new ArrayList<BaseEntity>();
        courseArrayList = new ArrayList<BaseEntity>();

    }

    private void checkDuplicateId(BaseEntity entity, ArrayList<BaseEntity> storage, EntityType type) throws DuplicateIDException{
        for(BaseEntity iterator : storage){
            if(iterator.getId() == entity.getId()){
                throw new DuplicateIDException(type+" ID "+ iterator.getId() + " already exists");
            }
        }
    }

    @Override
    public boolean add(BaseEntity entity, EntityType type) throws DuplicateIDException, NegativeIDException {
        switch (type){
            case EntityType.student:
                if(entity.getId() < 0){
                    throw new NegativeIDException("Student ID cannot be negative");
                }
                checkDuplicateId(entity, studentArrayList, type);
                studentArrayList.add(entity);
                return true;

            case EntityType.teacher:
                if(entity.getId() < 0){
                    throw new NegativeIDException("Teacher ID cannot be negative");
                }
                checkDuplicateId(entity, teacherArrayList, type);
                teacherArrayList.add(entity);
                return true;

            case EntityType.course:
                if(entity.getId() < 0){
                    throw new NegativeIDException("Course ID cannot be negative");
                }
                checkDuplicateId(entity, courseArrayList, type);
                courseArrayList.add(entity);
                return true;
        }
        return false;
    }

    private BaseEntity getIfPresent(int ID, ArrayList<BaseEntity> storage) throws IdNotFoundException{
        for(BaseEntity entity: storage){
            if(entity.getId() == ID){
                return entity;
            }
        }
        throw new IdNotFoundException("Id "+ID+" do not exist");
    }

    @Override
    public boolean remove(int ID, EntityType type) throws IdNotFoundException {
        switch (type){
            case EntityType.student:

                BaseEntity student = getIfPresent(ID, studentArrayList);
                if(student != null){
                    studentArrayList.remove(student);
                    return true;
                }
                return false;

            case EntityType.teacher:
                BaseEntity teacher = getIfPresent(ID, teacherArrayList);
                if(teacher != null){
                    teacherArrayList.remove(teacher);
                    return true;
                }
                return false;

            case EntityType.course:
                BaseEntity course = getIfPresent(ID, courseArrayList);
                if(course != null){
                    courseArrayList.remove(course);
                    return true;
                }
                return false;
        }
        return false;
    }

    private void display(ArrayList<BaseEntity> storage){
        for(BaseEntity entity: storage){
            entity.displayDetails();
        }
    }

    @Override
    public void displayAll(EntityType type) {
        switch (type){
            case EntityType.student:
                if(studentArrayList.isEmpty()){
                    System.out.println("No Student Exists.\n");
                    return;
                }
                display(studentArrayList);
                break;

            case EntityType.teacher:
                if(teacherArrayList.isEmpty()){
                    System.out.println("No Teacher Exists.\n");
                    return;
                }
                display(teacherArrayList);
                break;

            case EntityType.course:
                if(courseArrayList.isEmpty()){
                    System.out.println("No Course Exists.\n");
                    return;
                }
                display(courseArrayList);
                break;
        }
    }
}
