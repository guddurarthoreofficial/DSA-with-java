
        while (st.size() > index) {
            st2.push(st.pop());
        }
        st.push(321);

        while (st2.size() > 0) {
            st.push(st2.pop());
        }
        return st;