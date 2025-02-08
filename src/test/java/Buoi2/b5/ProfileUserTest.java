package Buoi2.b5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProfileUserTest {

    @Test
    void testGetNameWithValidProfile() {
        ProfileUser profile = new ProfileUser("Nguyen Van A");
        assertEquals("Nguyen Van A", profile.getName());
    }

    @Test
    void testGetNameWithNullName() {
        ProfileUser profile = new ProfileUser(null);
        Exception exception = assertThrows(NullPointerException.class, profile::getName);
        assertEquals("Tên người dùng không tồn tại!", exception.getMessage());
    }

    @Test
    void testGetNameWithNullProfile() {
        ProfileUser profile = null;
        assertThrows(NullPointerException.class, () -> {
            if (profile == null) {
                throw new NullPointerException("Hồ sơ không tồn tại!");
            }
            profile.getName();
        });
    }
}
