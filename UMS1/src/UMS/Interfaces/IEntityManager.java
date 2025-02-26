package UMS.Interfaces;

import UMS.AbstractClasses.BaseEntity;
import UMS.model.EntityType;

public interface IEntityManager {
    public boolean add(BaseEntity entity, EntityType type);
    public boolean remove(int ID, EntityType type);
    public void displayAll(EntityType type);
}
