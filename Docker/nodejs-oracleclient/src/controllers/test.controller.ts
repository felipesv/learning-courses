import { RequestHandler } from 'express';

export const test: RequestHandler = (req, res) => {
    res.json({ message: 'Hello world'});
};