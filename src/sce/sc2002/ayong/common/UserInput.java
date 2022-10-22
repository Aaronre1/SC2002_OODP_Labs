package sce.sc2002.ayong.common;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UserInput implements IUserInput {
    private Scanner _sc;
    private Queue<String> _inputQueue;
    private boolean _isScanner;

    public UserInput() {
        _isScanner = true;
        _sc = new Scanner(System.in);
    }

    public UserInput(String[] inputQueue) {
        _isScanner = false;
        _inputQueue = new LinkedList<>(Arrays.stream(inputQueue).toList());
    }

    public int nextInt() {
        if (_isScanner) {
            return _sc.nextInt();
        }
        return Integer.parseInt(next());
    }

    public long nextLong() {
        if (_isScanner) {
            return _sc.nextLong();
        }
        return Long.parseLong(next());
    }

    public double nextDouble() {
        if (_isScanner) {
            return _sc.nextDouble();
        }
        return Double.parseDouble(next());
    }

    public String next() {
        if (_isScanner) {
            return _sc.next();
        }
        String result = _inputQueue.poll();
        System.out.println(result);
        return result;
    }

    public String nextLine() {
        if (_isScanner) {
            return _sc.nextLine();
        }
        String result = _inputQueue.poll();
        System.out.println(result);
        return result;
    }

    public void close() {
        if (_isScanner) {
            _sc.close();
        }
    }
}
