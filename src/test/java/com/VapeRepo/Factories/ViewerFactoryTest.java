package com.VapeRepo.Factories;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.VapeRepo.Domain.Comment;
import com.VapeRepo.Domain.FavouriteRecipes;
import com.VapeRepo.Domain.Viewer;
import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.assertEquals;

/**
 * Created by dylan on 8/13/2017.
 */
public class ViewerFactoryTest {
    Map<String, Object> values;
    List<Comment> comment;
    List<FavouriteRecipes> favouriteRecipes;
    Date date = new Date();

    @Before
    public void setUp() throws Exception{
        values = new HashMap<String, Object>();
        values.put("name", "Dylan");
        values.put("password", "Master01");
        values.put("email", "dylanseptember@gmail.com");
        values.put("comment", comment);
        values.put("favouriteRecipes", favouriteRecipes);
        values.put("rep", 100);
        values.put("date", date);
    }

    @Test
    public void getViewerNameFalse() throws Exception {
        Viewer viewer = ViewerFactory.getViewer(values);
        assertEquals("Doe", viewer.getName());
    }

    @Test
    public void getViewerNameTrue() throws Exception {
        Viewer viewer = ViewerFactory.getViewer(values);
        assertEquals("Dylan", viewer.getName());
    }

    @Test
    public void getViewerPasswordFalse() throws Exception {
        Viewer viewer = ViewerFactory.getViewer(values);
        assertEquals("Doe", viewer.getPassword());
    }

    @Test
    public void getViewerPasswordTrue() throws Exception {
        Viewer viewer = ViewerFactory.getViewer(values);
        assertEquals("Master01", viewer.getPassword());
    }

    @Test
    public void getViewerRepFalse() throws Exception {
        Viewer viewer = ViewerFactory.getViewer(values);
        assertEquals(80, viewer.getRep());
    }

    @Test
    public void getViewerRepTrue() throws Exception {
        Viewer viewer = ViewerFactory.getViewer(values);
        assertEquals(100, viewer.getRep());
    }
}
