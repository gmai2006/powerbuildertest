import React, {useState} from 'react';
import {Form, Button} from 'react-bootstrap';

const FormSQL = () => {
    const [post, setPost] = useState({})

    const onSubmit = (e) => {
        e.preventDefault()
    }
    return (
        <React.Fragment>
            <Form onSubmit={onSubmit}>
                <Form.Group>
                    <Form.Label>Create your SQL</Form.Label>
                    <Form.Control as="textarea" rows={15} onChange={e => setPost({ ...post, content: e.target.value })} />
                </Form.Group>
                <Button variant="primary" type="submit">
                    Submit
                </Button>
            </Form>
        </React.Fragment>
    )
}

export default FormSQL;
