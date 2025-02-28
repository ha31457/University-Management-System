package UMS.Interfaces;

import UMS.AbstractClasses.BaseEntity;
import UMS.Exceptions.DuplicateIDException;
import UMS.Exceptions.IdNotFoundException;
import UMS.Exceptions.NegativeIDException;
import UMS.model.EntityType;

public interface IEntityManager {
    public boolean add(BaseEntity entity, EntityType type) throws DuplicateIDException, NegativeIDException, IdNotFoundException;
    public boolean remove(int ID, EntityType type) throws IdNotFoundException;
    public void displayAll(EntityType type);
}
