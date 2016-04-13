package de.matthiasseifert;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class SakuraniDaoGenerator {

    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(1, "de.matthiasseifert.sakuranidaogenerator");

        Entity book = schema.addEntity("Book");
        book.addIdProperty();
        book.addStringProperty("Isbn");
        book.addStringProperty("Title");
        book.addIntProperty("Year");
        book.addStringProperty("Language");
        book.addStringProperty("publisher");
        book.addStringProperty("Edition");
        book.addBooleanProperty("IsEbook");
        book.addStringProperty("CoverImage");
        book.addDoubleProperty("Value");

        Entity series = schema.addEntity("Series");
        series.addIdProperty();
        series.addStringProperty("Name");

        Entity seriesAssignment = schema.addEntity("SeriesAssignment");
        seriesAssignment.addIdProperty();
        seriesAssignment.addLongProperty("SuperiorSeriesId");
        seriesAssignment.addLongProperty("BookId");

        Entity person = schema.addEntity("Person");
        person.addIdProperty();
        person.addStringProperty("FirstName");
        person.addStringProperty("MiddleName");
        person.addStringProperty("LastName");
        person.addStringProperty("Gender");

        Entity personAssignment = schema.addEntity("PersonAssignment");
        personAssignment.addLongProperty("PersonId");
        personAssignment.addLongProperty("BookId");

        Entity roles = schema.addEntity("Roles");
        roles.addIdProperty();
        roles.addStringProperty("RoleName");

        Entity personRoles = schema.addEntity("PersonRoles");
        personRoles.addLongProperty("PersonId");
        personRoles.addLongProperty("RoleId");
    }
}
